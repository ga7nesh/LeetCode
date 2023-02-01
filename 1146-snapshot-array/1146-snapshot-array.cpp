class SnapshotArray {
 public:
  struct Node {
    Node* ne[10];
    int val;
    Node() : val(0) { fill(ne, ne + 10, nullptr); }
    Node(int x) : val(x) { fill(ne, ne + 10, nullptr); }
  };
  vector<Node*> v;
  SnapshotArray(int length) { v.push_back(new Node()); }

  void set(int index, int val) {
    string s = to_string(index);
    auto *p = v.back(), *q = p;
    for (char ch : s) {
      int idx = ch - '0';
      if (!p->ne[idx]) {
        p->ne[idx] = new Node();
        p = p->ne[idx];
      } else {
        q = p->ne[idx];
        p->ne[idx] = new Node(q->val);
        p = p->ne[idx];
        for (int i = 0; i < 10; i++) p->ne[i] = q->ne[i];
      }
    }

    p->val = val;
  }

  int snap() {
    auto *p = new Node(), *q = v.back();
    for (int i = 0; i < 10; i++) p->ne[i] = q->ne[i];
    v.push_back(p);
    return v.size() - 2;
  }

  int get(int index, int snap_id) {
    string s = to_string(index);
    auto* p = v[snap_id];
    for (char ch : s) {
      int idx = ch - '0';
      if (!p->ne[idx]) return 0;
      p = p->ne[idx];
    }

    return p->val;
  }
};

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray* obj = new SnapshotArray(length);
 * obj->set(index,val);
 * int param_2 = obj->snap();
 * int param_3 = obj->get(index,snap_id);
 */