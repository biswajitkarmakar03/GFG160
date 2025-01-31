from collections import OrderedDict
class LRUCache:
    def __init__(self, cap):
        self.capacity = cap
        self.cache = OrderedDict()
    def get(self, key):
        if key not in self.cache:
            return -1
        else:
            self.cache.move_to_end(key)
            return self.cache[key]
    def put(self, key, value):
        if key in self.cache:
            self.cache.move_to_end(key)
        elif len(self.cache) == self.capacity:
            self.cache.popitem(last = False)
        self.cache[key] = value
