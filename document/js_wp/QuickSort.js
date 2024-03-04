
// 快速排序
function quickSort(a) {
    if (!a || a.length ==0) {
        return;
    }
    // 优化：打乱 a 的顺序
    shuffle(a)
    sort(a, 0, a.length-1);
}

// 打乱 a 的顺序， 避免极端的情况
function shuffle(a) {
    for (let i=0; i<a.length; i++) {
        let j = Math.floor(Math.random() * (a.length-i))
        exch(a, i, i+j);
    }
}

function sort(a, lo, hi) {
    if (lo>=hi) return;
    // 分成两半，左边的都小于a[p], 右边的都大于a[p]
    let p = partition(a, lo, hi);

    sort(a, lo, p-1);
    sort(a, p+1, hi);
}

function partition(a, lo, hi) {
    let left = lo;
    let right = hi+1;
    let j = lo;
    while (left<right) {
        while (less(a, ++left, j)) if (left==hi) break;
        while (less(a, j, --right)) if (right==lo) break;
        if (left>=right) break;
        exch(a, left, right)
    }
    exch(a, j, right);
    return right;
}

function less(a, i, j) {
    if (a[i]<a[j]) {
        return true;
    } else {
        return false;
    }
}

function exch(a, i, j) {
    let t = a[i];
    a[i] = a[j];
    a[j] = t;
}

let a = [3, 6, 1, 2, 9, 0, 1, 2, 3]
console.log(a);
quickSort(a);
console.log(a);

