const toastSuccess = document.querySelector("#liveToast1")
const toastError = document.querySelector("#liveToast2")
function newElement() {
    const input = document.querySelector("#task")
    const list = document.querySelector("#list")

    let text = input.value.trim()

    if (text !== "") {
        let newLi = document.createElement("li")
        newLi.appendChild(document.createTextNode(text))

        let newDeleteIcon = document.createElement("span")
        newDeleteIcon.className = "delete-icon"
        newDeleteIcon.innerHTML = "&#10006"
        newDeleteIcon.onclick = function() {
            list.removeChild(newLi)
        };

        newLi.appendChild(newDeleteIcon)
        list.appendChild(newLi)

        newLi.onclick = function() {
            newLi.classList.toggle("completed")
        };

        $(toastSuccess).toast(`show`);
        input.value = ""
    }else {
        $(toastError).toast(`show`);
    }
}

function removeElement(element) {
    let li = element.parentNode
    li.parentNode.removeChild(li)
    $(toastSuccess).toast(`show`);
}

function toggleCompleted(element) {
    element.classList.toggle("completed")
}


  
