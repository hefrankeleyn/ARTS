
// 从上到下归并排序 （递推）
function upToBottomMergeSort(a) {
    if (!a || a.length==0) {
        return;
    }
    let aux = []
    for (let i=0; i<a.length; i++) {
        aux[i] = i;
    }
    for (let k = 1; k<a.length; k = k*2) {
        for (let i=0; i<a.length; i = i + k * 2) {
            merge(a, i, i+k, Math.min(i+k+k-1, a.length-1), aux);
        }
    }
}

function merge(a, lo, mid, hi, aux) {
    for (let k=0; k<=hi; k++) {
        aux[k] = a[k];
    }
    let x = lo, y = mid;
    for (let k = lo; k<=hi; k++) {
        if (x>=mid) a[k] = aux[y++];
        else if (y>hi) a[k] = aux[x++];
        else if (less(aux, x, y)) a[k] = aux[x++];
        else a[k] = aux[y++];
    }
}


function less(a, i, j) {
    if (a[i]<a[j]) {
        return true;
    } else {
        return false;
    }
}

// let a = [3, 6, 1, 2, 9, 0, 1, 2, 3]
let a = [3, 6, 1, 2, 9, 0, 1, 2, 3, 3, 3, 1, 2, 0, 0, 9, 3, 6, 1, 2, 9, 0, 1, 2, 3, 3, 3, 1, 2, 0, 0, 9]
console.log(a);
upToBottomMergeSort(a);
console.log(a);

