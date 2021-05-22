#!/usr/bin/python3

class Trie:

    def __init__(self):
        self.root = {}
        self.end_of_word="#"

    def insert(self, word:str):
        node = self.root
        for char in word:
            node = node.setdefault(char, {})
        node[self.end_of_word] = self.end_of_word
    
    def search(self, word: str):
        node = self.root
        for c in word:
            if c not in node:
                return False
            node = node[c]
        return self.end_of_word in node
    
    def startWith(self, word: str):
        node = self.root
        for c in word:
            if c not in node:
                return False
            node = node[c]
        return True

    
