
// 希尔排序，基于插入排序
function shellSort(a) {
    if (!a || a.length==0) {
        return;
    }
    let k = 1;
    while (k<Math.floor(a/3)) {
        k = k * 3 + 1;
    }

    while (k>=1) {
        for (let i=k; i<a.length; i++) {
            let j = i-k;
            let v = a[i];
            for (;j>=0; j-=k) {
                if (less(v, a[j])) {
                    a[j+k] = a[j];
                }else {
                    break
                }
            }
            a[j+k] = v;
        }
        k = Math.floor(k/3)
    }
}

function less(v1, v2) {
    if (v1<v2) {
        return true;
    }else {
        return false;
    }
}

// let a = [3, 6, 1, 2, 9, 0, 1, 2, 3]
let a = [3, 6, 1, 2, 9, 0, 1, 2, 3, 3, 3, 1, 2, 0, 0, 9, 3, 6, 1, 2, 9, 0, 1, 2, 3, 3, 3, 1, 2, 0, 0, 9]
console.log(a);
shellSort(a);
console.log(a);