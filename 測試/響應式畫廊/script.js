$(document).ready(function () {
    // Resize media items based on the container size
    function resizeMediaItems() {
        var $mediaItems = $('.media-item');
        $mediaItems.each(function () {
            var $mediaItem = $(this);
            var mediaType = $mediaItem.data('type');
            var aspectRatio = (mediaType === 'image') ? 1.5 : 0.5625; // 16:9 aspect ratio for videos
            var width = $mediaItem.width();
            var height = width * aspectRatio;
            $mediaItem.css('height', height);
        });
    }

    // Handle auto-playing of videos
    $('.media-item video').on('play', function () {
        $('.media-item video').not(this).each(function () {
            this.pause();
        });
    });

    // Call the resize function on page load and window resize
    resizeMediaItems();
    $(window).on('resize', resizeMediaItems);
});