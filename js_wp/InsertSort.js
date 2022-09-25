
// 插入排序
function insertSort(a) {
    if (!a || a.length == 0) {
        return;
    }
    for (let i=1; i<a.length; i++) {
        let j = i-1;
        let t = a[i];
        for (; j>=0; j--) {
            if (less(t, a[j])) {
                a[j+1] = a[j]; 
            } else {
                break;
            }
        }
        a[j+1] = t;
    }
}

function less(v1, v2) {
    if (v1<v2) {
        return true;
    } else {
        return false;
    }
}

let a = [3, 6, 1, 2, 9, 0, 1, 2, 3]
// let a = [3, 6, 1, 2, 9, 0, 1, 2, 3, 3, 3, 1, 2, 0, 0, 9]
console.log(a);
insertSort(a);
console.log(a);