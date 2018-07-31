package com.prolificinteractive.materialcalendarview.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;

public class BadgeSpan implements LineBackgroundSpan {

    private final int badge;
    private final int backgroundColor;
    private final int textColor;

    public BadgeSpan(int badge, int backgroundColor, int textColor) {
        this.badge = badge;
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
    }

    @Override
    public void drawBackground(Canvas canvas, Paint paint, int left, int right,
                               int top, int baseline, int bottom,
                               CharSequence text, int start, int end, int lineNum) {
        int oldColor = paint.getColor();
        if (backgroundColor != 0) {
            paint.setColor(backgroundColor);
        }
        canvas.drawCircle((left + right) / 2, bottom + 10, 10, paint);
        paint.setColor(oldColor);
    }
}
