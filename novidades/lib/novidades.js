// Estudos sobre a Tag dialog
function dialogManipulation() {
    const 
        modal = document.querySelector("dialog"),
        openDialog = document.querySelector("button.openDialog"),
        closeDialog = document.querySelectorAll("button.closeDialog");
        
    //abre a modal
    openDialog.onclick = function () {
        modal.showModal();
        modal.style = "opacity: 100%;";
    }

    //fecha a modal
    closeDialog.forEach(button => {
        button.onclick = function () {
            modal.close();
            modal.style = "opacity: 0%;";
        }
    });
}dialogManipulation();