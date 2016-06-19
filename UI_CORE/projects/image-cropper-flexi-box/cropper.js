var imageCropper = {

    ctx: document.getElementById("panel").getContext("2d"),
    image: new Image(),

    x: 10,
    y: 10,
    w: 200,
    h: 200,
    px: this.x, // extra variables to dragging calculations
    py: this.y,

    csize: 6, // resize cubes size
    csizeh: 10, // resize cubes size (on hover)

    bHow: [false, false, false, false], // hover statuses
    iCSize: [6, 6, 6, 6], // resize cubes sizes
    bDrag: [false, false, false, false], // drag statuses
    bDragAll: false, // drag whole selection

    iMouseX: 1,
    iMouseY: 1,



    init: function() {
        this.image.src = 'praveen.png';
        this.image.onload = this.drawSelBox.bind(this);
        this.ctx.canvas.onmousedown = this.onMouseDown.bind(this);
        this.ctx.canvas.onmousemove = this.onMouseMove.bind(this);
        this.ctx.canvas.onmouseup = this.onMouseUp.bind(this);
        document.getElementById("cropImgButtn").onclick = this.showCropedImage.bind(this);


    },

    drawSelBox: function() {

        this.ctx.clearRect(0, 0, this.ctx.canvas.width, this.ctx.canvas.height); // clear canvas
        // draw source image
        var imgHeight = this.image.height;
        var imgWidth = this.image.width;

        var scale = 0.5;

         var imgWidth = Math.floor(this.image.width * scale);
        var imgHeight = Math.floor(this.image.height * scale);
        this.ctx.drawImage(this.image, 0, 0,imgWidth,imgHeight);



        // and make it darker
       // this.ctx.fillStyle = 'rgba(0, 0, 0, 0.5)';
        // this.ctx.fillRect(0, 0, this.ctx.canvas.width, this.ctx.canvas.height);



       // this.ctx.strokeStyle = '#000';
        // this.ctx.lineWidth = 2;
        //this.ctx.fill();
        // this.ctx.strokeRect(this.x, this.y, this.w, this.h);

        // draw part of original image
        if (this.w > 0 && this.h > 0) {
            // this.ctx.drawImage(this.image, this.x, this.y, this.w, this.h, this.x, this.y, this.w, this.h);
        }

        this.drawCutout();


        // draw resize cubes
        this.ctx.fillStyle = '#fff';
        this.ctx.fillRect(this.x - this.iCSize[0], this.y - this.iCSize[0], this.iCSize[0] * 2, this.iCSize[0] * 2);
        this.ctx.fillRect(this.x + this.w - this.iCSize[1], this.y - this.iCSize[1], this.iCSize[1] * 2, this.iCSize[1] * 2);
        this.ctx.fillRect(this.x + this.w - this.iCSize[2], this.y + this.h - this.iCSize[2], this.iCSize[2] * 2, this.iCSize[2] * 2);
        this.ctx.fillRect(this.x - this.iCSize[3], this.y + this.h - this.iCSize[3], this.iCSize[3] * 2, this.iCSize[3] * 2);
    },

    drawCutout: function() {

        this.ctx.fillStyle = 'rgba(0, 0, 0, 0.5)';

        this.ctx.beginPath();
        this.ctx.rect(0, 0, this.ctx.canvas.width, this.ctx.canvas.height);

        //Draw anti clockwise rectangle, for cutout.
          this.ctx.moveTo(this.x, this.y);
        this.ctx.lineTo(this.x, this.y + this.h);
        this.ctx.lineTo(this.x + this.w, this.y + this.h);
        this.ctx.lineTo(this.x + this.w, this.y);
        this.ctx.closePath();


      //         context.moveTo(x, y);
      // context.lineTo(x, y + h);
      // context.lineTo(x + w, y + h);
      // context.lineTo(x + w, y);
      // context.closePath(); 



        this.ctx.fill();

    },




    onMouseDown: function(e) {

        var loc = this.windowToCanvas(e.clientX, e.clientY);
        iMouseX = loc.x;
        iMouseY = loc.y;

        this.px = iMouseX - this.x;
        this.py = iMouseY - this.y;

        if (this.bHow[0]) {
            this.px = iMouseX - this.x;
            this.py = iMouseY - this.y;
        }
        if (this.bHow[1]) {
            this.px = iMouseX - this.x - this.w;
            this.py = iMouseY - this.y;
        }
        if (this.bHow[2]) {
            this.px = iMouseX - this.x - this.w;
            this.py = iMouseY - this.y - this.h;
        }
        if (this.bHow[3]) {
            this.px = iMouseX - this.x;
            this.py = iMouseY - this.y - this.h;
        }

        if (iMouseX > this.x + this.csizeh && iMouseX < this.x + this.w - this.csizeh &&
            iMouseY > this.y + this.csizeh && iMouseY < this.y + this.h - this.csizeh) {

            this.bDragAll = true;


        }

        for (i = 0; i < 4; i++) {
            if (this.bHow[i]) {
                this.bDrag[i] = true;
            }
        }


    },

    onMouseMove: function(e) {
        var loc = this.windowToCanvas(e.clientX, e.clientY);
        iMouseX = loc.x;
        iMouseY = loc.y;

        this.drawSelBox();


        // in case of drag of whole selector
        if (this.bDragAll) {
            this.x = iMouseX - this.px;
            this.y = iMouseY - this.py;
        }

        for (i = 0; i < 4; i++) {
            this.bHow[i] = false;
            this.iCSize[i] = this.csize;
        }

        // hovering over resize cubes
        if (iMouseX > this.x - this.csizeh && iMouseX < this.x + this.csizeh &&
            iMouseY > this.y - this.csizeh && iMouseY < this.y + this.csizeh) {

            this.bHow[0] = true;
            this.iCSize[0] = this.csizeh;
        }
        if (iMouseX > this.x + this.w - this.csizeh && iMouseX < this.x + this.w + this.csizeh &&
            iMouseY > this.y - this.csizeh && iMouseY < this.y + this.csizeh) {

            this.bHow[1] = true;
            this.iCSize[1] = this.csizeh;
        }
        if (iMouseX > this.x + this.w - this.csizeh && iMouseX < this.x + this.w + this.csizeh &&
            iMouseY > this.y + this.h - this.csizeh && iMouseY < this.y + this.h + this.csizeh) {

            this.bHow[2] = true;
            this.iCSize[2] = this.csizeh;
        }
        if (iMouseX > this.x - this.csizeh && iMouseX < this.x + this.csizeh &&
            iMouseY > this.y + this.h - this.csizeh && iMouseY < this.y + this.h + this.csizeh) {

            this.bHow[3] = true;
            this.iCSize[3] = this.csizeh;
        }

        // in case of dragging of resize cubes
        var iFX, iFY, iFW, iFH;
        if (this.bDrag[0]) {
            iFX = iMouseX - this.px;
            iFY = iMouseY - this.py;
            iFW = this.w + this.x - iFX;
            iFH = this.h + this.y - iFY;
        }
        if (this.bDrag[1]) {
            iFX = this.x;
            iFY = iMouseY - this.py;
            iFW = iMouseX - this.px - iFX;
            iFH = this.h + this.y - iFY;
        }
        if (this.bDrag[2]) {
            iFX = this.x;
            iFY = this.y;
            iFW = iMouseX - this.px - iFX;
            iFH = iMouseY - this.py - iFY;
        }
        if (this.bDrag[3]) {
            iFX = iMouseX - this.px;
            iFY = this.y;
            iFW = this.w + this.x - iFX;
            iFH = iMouseY - this.py - iFY;
        }

        if (iFW > this.csizeh * 2 && iFH > this.csizeh * 2) {
            this.w = iFW;
            this.h = iFH;

            this.x = iFX;
            this.y = iFY;
        }



    },

    onMouseUp: function(e) {


        this.bDragAll = false;

        for (i = 0; i < 4; i++) {
            this.bDrag[i] = false;
        }
        this.px = 0;
        this.py = 0;
    },


    windowToCanvas: function(x, y) {
        var canvas = this.ctx.canvas;
        var bbox = canvas.getBoundingClientRect();
        return {
            x: x - bbox.left * (canvas.width / bbox.width),
            y: y - bbox.top * (canvas.height / bbox.height)
        };
    },

    showCropedImage: function() {

        var temp_ctx, temp_canvas;
        temp_canvas = document.createElement('canvas');
        temp_ctx = temp_canvas.getContext('2d');
        temp_canvas.width = this.w;
        temp_canvas.height = this.h;
        temp_ctx.drawImage(this.image, this.x, this.y, this.w, this.h, 0, 0, this.w, this.h);
        var vData = temp_canvas.toDataURL();
        document.getElementById('crop_result').src = vData;
    }



};


imageCropper.init();