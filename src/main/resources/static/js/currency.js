function vypsat(data) {
    var obj = data;
    obj = data["kurzy"];
    let html = '<div class="row">\n' +
        '<div class="col-3"></div>\n'  +
        '    <label class="col-2 text-right lead" for="Select1">Výběr měny:</label>\n' +
        '    <select class="col-1 w-25 form-select" id="Select1">';
    Object.entries(obj).forEach((entry) => {
        const [key, value] = entry;
        html += `<option value="${value["dev_stred"]}">${key}  |   ${value["dev_stred"]}</option>`;
    });
    html += '    </select>\n' +
        '</div>';
    document.querySelector('.container').innerHTML = html;
}
function dph() {
    let price = parseFloat(document.getElementById("mainPrice").innerHTML);
    document.getElementById("priceDPH").innerHTML = (price * 1.21).toFixed(2).toString();
}
function finalPrice() {
    let price = parseFloat(document.getElementById("priceDPH").innerHTML);
    let count = parseFloat(document.getElementById("stockCount").innerHTML);
    document.getElementById("priceFinal").innerHTML = (price * count).toFixed(2).toString();
}

function calculate() {
    let price = document.getElementById("backupPrice").innerHTML;
    let exRate = document.getElementById("Select1");
    exRate = exRate.options[exRate.selectedIndex].value;
    document.getElementById("mainPrice").innerHTML = (parseFloat(price) / parseFloat(exRate)).toFixed(2).toString();
    dph();
    finalPrice();
}
function calculateCZK() {
    document.getElementById("mainPrice").innerHTML = document.getElementById("backupPrice").innerHTML;
    dph();
    finalPrice();
}

dph();
finalPrice();



