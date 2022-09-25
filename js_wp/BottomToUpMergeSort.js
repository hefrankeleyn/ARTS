
// 从下到上归并排序
function bottomToUpMergeSort(a) {
    if (!a || a.length==0) {
        return;
    }
    let aux = []
    for (let i=0; i<a.length; i++) {
        aux[i] = a[i];
    }
    sort(a, 0, a.length-1, aux);
}

function sort(a, lo, hi, aux) {
    if (lo>=hi) return;

    let mid = Math.floor((lo+hi)/2);
    sort(a, lo, mid, aux);
    sort(a, mid+1, hi, aux);

    merge(a, lo, mid, hi, aux);
    
}

function merge(a, lo, mid, hi, aux) {
    for (let k=lo; k<=hi; k++) {
        aux[k] = a[k];
    }
    let x = lo, y = mid+1;
    for (let k=lo; k<=hi; k++) {
        if (x>mid) a[k] = aux[y++]
        else if (y>hi) a[k] = aux[x++];
        else if (less(aux, x, y)) a[k] = aux[x++];
        else a[k] = aux[y++]
    }
}

function less(a, i, j) {
    if (a[i] < a[j]) {
        return true;
    } else {
        return false;
    }
}

// let a = [3, 6, 1, 2, 9, 0, 1, 2, 3]
let a = [3, 6, 1, 2, 9, 0, 1, 2, 3, 3, 3, 1, 2, 0, 0, 9, 3, 6, 1, 2, 9, 0, 1, 2, 3, 3, 3, 1, 2, 0, 0, 9]
console.log(a);
bottomToUpMergeSort(a);
console.log(a);