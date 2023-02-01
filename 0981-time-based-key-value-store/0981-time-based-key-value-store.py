class TimeMap:

    def __init__(self):
        self.time_store = dict()

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in self.time_store:
            self.time_store[key] = []
            
        self.time_store[key].append((value, timestamp))

    def get(self, key: str, timestamp: int) -> str:
        if key not in self.time_store:
            return ""
        
        values = self.time_store[key]
        
        if values[0][1] > timestamp:
            return ""
    
        left = 0
        right = len(values) - 1
        
        while left <= right:
            mid = (left + right) // 2
            if values[mid][1] > timestamp:
                right = mid - 1
            else:
                left = mid + 1
        
        return values[right][0]