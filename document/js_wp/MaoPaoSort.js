
// 冒泡排序
function maoPaoSort(a) {
    if (!a || a.length==0) {
        return;
    }
    for (let i=0; i<a.length-1; i++) {
        for (let j=1; j<a.length-i; j++) {
            if (less(a, j, j-1)) {
                exch(a, j, j-1);
            }
        }
    }
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
maoPaoSort(a);
console.log(a);