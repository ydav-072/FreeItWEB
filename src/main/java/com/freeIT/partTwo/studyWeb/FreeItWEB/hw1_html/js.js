let btn = document.getElementById("btn");
btn.addEventListener("click", () => {
    let value = document.getElementById('form').value;
    if (value) {
        alert('Hello, user.\nYou entered: ' + value);
    } else {
        alert('You haven\'t entered anything');
    }
});
