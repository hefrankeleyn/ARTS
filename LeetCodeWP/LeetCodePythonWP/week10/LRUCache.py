#!/usr/bin/python3

import collections

class LRUCache:
    def __init__(self, capacity):
        self.dic = collections.OrderedDict()
        self.remain = capacity
    
    def get(self, key):
        if key not in self.dic:
            return -1
        v = self.dic.pop(key)
        self.dic[key] = v
        return v
    
    def pop(self, key, value):
        if key in self.dic:
            self.dic.pop(key)
        else:
            if self.remain > 0:
                self.remain -= 1
            else:
                self.dic.popitem(last=False)
        self.dic[key] = value


        