from bitarray import bitarray
import mmh3

class BloomFilter:
    def __init__(self, size, hash_num):
        self.bit_array=bitarray(size)
        self.hash_num=hash_num
        self.size=size

    def add(self, s):
        for seed in range(self.hash_num):
            i=mmh3.hash(s, seed)%self.size
            self.bit_array[i]=1

    def find(self, s):
        for seed in range(self.hash_num):
            i = mmh3.hash(s, seed) % self.size
            res = self.bit_array[i]
            if res==0:
                return 'None'
        return "Probaly"

try:
    bf = BloomFilter(50000, 3)
    bf.add('aaa')
    print(bf.find('aaa'))
    print(bf.find('world'))
except Exception as e:
    raise e