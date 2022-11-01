package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Next: ImageVector
    get() {
        if (_next != null) {
            return _next!!
        }
        _next = Builder(name = "Next", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7617f, 7.2196f)
                verticalLineTo(16.7896f)
                curveTo(3.7617f, 18.7496f, 5.8917f, 19.9796f, 7.5917f, 18.9996f)
                lineTo(11.7417f, 16.6096f)
                lineTo(15.8917f, 14.2096f)
                curveTo(17.5917f, 13.2296f, 17.5917f, 10.7796f, 15.8917f, 9.7996f)
                lineTo(11.7417f, 7.3996f)
                lineTo(7.5917f, 5.0096f)
                curveTo(5.8917f, 4.0296f, 3.7617f, 5.2496f, 3.7617f, 7.2196f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2383f, 18.9303f)
                curveTo(19.8283f, 18.9303f, 19.4883f, 18.5903f, 19.4883f, 18.1803f)
                verticalLineTo(5.8203f)
                curveTo(19.4883f, 5.4103f, 19.8283f, 5.0703f, 20.2383f, 5.0703f)
                curveTo(20.6483f, 5.0703f, 20.9883f, 5.4103f, 20.9883f, 5.8203f)
                verticalLineTo(18.1803f)
                curveTo(20.9883f, 18.5903f, 20.6583f, 18.9303f, 20.2383f, 18.9303f)
                close()
            }
        }
        .build()
        return _next!!
    }

private var _next: ImageVector? = null
