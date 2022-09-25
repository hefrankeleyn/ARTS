


// 堆排序
function heapSort(a) {
    if (!a || a.length==0) {
        return
    }
    // 整数与整数相除，可能得到的是小数
    let k = Math.round(a.length/2,0);
    let N = a.length;
    while (k>=1) {
        sink(a, k, N);
        k--;
    }

    while (N>1) {
        exch(a, 1, N);
        N--;
        sink(a, 1, N);
    }
}

// 堆排序的关键： 下沉
function sink(a, k, n) {
    while (k * 2 <=n) {
        let j = k * 2;
        if (j+1<=n && less(a, j, j+1)) j++;
        if (less(a, j, k)) return;
        exch(a, j, k);
        k = j;
    }
}

// 判断a[i-1] < a[j-1]
function less(a, i, j) {
    if (a[i-1]<a[j-1]) {
        return true;
    } else {
        return false;
    }
}

// 将 i-1 与 j-1 交换位置
function exch(a, i, j) {
    let t = a[i-1];
    a[i-1] = a[j-1];
    a[j-1] = t;
}

let a = [3, 6, 1, 2, 9, 0, 1, 2, 3]
console.log(a);
heapSort(a);
console.log(a);