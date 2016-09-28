// add an event handler for the ready event method
$(document).ready(function() {

    // preload images
    $("#image_list a").each(function() {
        // get url and title
        var URL = $(this).attr("href");
        var title = $(this).attr("title");

        var image = new Image();
        image.src = URL;
        image.src = title;
    });

    // set up event handlers
    $("#image_list a").click(function(evt) {

        // change image with new image
        var newImage = $(this).attr("href");
        $("#image").attr("src", newImage);

        //swap caption
        var newCaption = $(this).attr("title");
        $("#caption").text(newCaption);

        // cancel the default action of the link
        evt.preventDefault();

    }); // end click

    // move focus to first thumbnail
    $("li:first-child a").focus();

});

