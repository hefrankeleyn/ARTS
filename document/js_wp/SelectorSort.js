
// 判断 a[i]<a[j]
function less(a, i, j) {
    if (a[i]<a[j]) {
        return true;
    } else {
        return false;
    }
}

// 交换 i 和 j的位置
function exch(a, i, j) {
    let t = a[i];
    a[i] = a[j];
    a[j] = t;
}

// 选择排序
function selectorSort(a) {
    if (!a || a.length==0) {
        return;
    }
    for (let i=0; i<a.length-1; i++) {
        let t = i;
        for (let j=i+1; j<a.length; j++) {
            if (less(a, j, t)) {
                t = j;
            }
        }
        exch(a, t, i)
    }
}


let a = [3, 6, 1, 2, 9, 0, 1, 2, 3]
console.log(a);
selectorSort(a);
console.log(a);