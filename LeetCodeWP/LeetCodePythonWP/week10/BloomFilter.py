#!/usr/bin/python3

import re,mmh3
from bitarray import bitarray

class BloomFilter:

    def __init__(self, size, hash_num):
        self.size=size
        self.hash_num=hash_num
        self.bit_array=bitarray(size)
        self.bit_array.setall(0)
    
    def add(self, s):
        for seed in range(self.hash_num):
            result = mmh3.hash(s, seed) % self.size
            self.bit_array[result] = 1
    
    def lookup(self, s):
        for seed in range(self.hash_num):
            result = mmh3.hash(s, seed) % self.size
            if self.bit_array[result]==0:
                return "None"
        return "Probably"

try:
    bf = BloomFilter(500000, 7)
    testStr = "helloworld"
    bf.add(testStr)
    print(bf.lookup(testStr))
    print(bf.lookup("word"))

except Exception as e:
    print(e)
    raise e


