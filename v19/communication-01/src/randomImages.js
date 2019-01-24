let numberOfTardis = 0
let numberOfC3PO = 0
let numberOfCylon = 0

function removeAllImages() {
    for (let i = document.images.length; i--> 0;) {
        document.images[i].parentNode.removeChild(document.images[i])
    }
}

function showImages() {
    removeAllImages();
    show_image(linkToImageLocation(getRandomIntInclusive(1,3)), 96, 96, 'Image')
    show_image(linkToImageLocation(getRandomIntInclusive(1,3)), 96, 96, 'Image')
    show_image(linkToImageLocation(getRandomIntInclusive(1,3)), 96, 96, 'Image')
}

function show_image(src, width, height, alt) {
    let img = document.createElement("img");
    img.src = src;
    img.width = width;
    img.height = height;
    img.alt = alt;
    document.body.appendChild(img);
}

function getRandomIntInclusive(min, max) {
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

function linkToImageLocation(number) {
    const src1 = 'https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication/img/tardis.png'
    const src2 = 'https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication/img/c3po.png'
    const src3 = 'https://raw.githubusercontent.com/sivhollup/inf112/master/v19/communication/img/cylon.png'
    if (number === 1) {
        numberOfTardis = numberOfTardis + 1
        return src1
    }
    if (number === 2) {
        numberOfC3PO = numberOfC3PO + 1
        return src2
    }
    if (number === 3) {
        numberOfCylon = numberOfCylon + 1
        return src3
    }
}

function showResults() {
    let textDiv = document.createElement('div')
    textDiv.appendChild(document.createTextNode('Tardis: ' + numberOfTardis))
    textDiv.appendChild(document.createTextNode('   C3PO: ' + numberOfC3PO))
    textDiv.appendChild(document.createTextNode('   Cylon:' + numberOfCylon))
    document.body.appendChild(textDiv);
}