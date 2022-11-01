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

public val BoldGroup.`Brush-4`: ImageVector
    get() {
        if (`_brush-4` != null) {
            return `_brush-4`!!
        }
        `_brush-4` = Builder(name = "Brush-4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 2.0f, 20.0f, 2.9f, 20.0f, 4.0f)
                verticalLineTo(7.32f)
                curveTo(20.0f, 7.87f, 19.55f, 8.32f, 19.0f, 8.32f)
                horizontalLineTo(5.0f)
                curveTo(4.45f, 8.32f, 4.0f, 7.87f, 4.0f, 7.32f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.9f, 4.9f, 2.0f, 6.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.3203f)
                verticalLineTo(11.8803f)
                curveTo(4.0f, 12.9603f, 4.58f, 13.9603f, 5.53f, 14.4903f)
                lineTo(8.49f, 16.1603f)
                curveTo(9.12f, 16.5103f, 9.51f, 17.1803f, 9.51f, 17.9003f)
                verticalLineTo(20.0003f)
                curveTo(9.51f, 21.1003f, 10.41f, 22.0003f, 11.51f, 22.0003f)
                horizontalLineTo(12.51f)
                curveTo(13.61f, 22.0003f, 14.51f, 21.1003f, 14.51f, 20.0003f)
                verticalLineTo(17.9003f)
                curveTo(14.51f, 17.1803f, 14.9f, 16.5103f, 15.53f, 16.1603f)
                lineTo(18.49f, 14.4903f)
                curveTo(19.43f, 13.9603f, 20.02f, 12.9603f, 20.02f, 11.8803f)
                verticalLineTo(10.3203f)
                curveTo(20.02f, 9.7703f, 19.57f, 9.3203f, 19.02f, 9.3203f)
                horizontalLineTo(5.0f)
                curveTo(4.45f, 9.3203f, 4.0f, 9.7603f, 4.0f, 10.3203f)
                close()
            }
        }
        .build()
        return `_brush-4`!!
    }

private var `_brush-4`: ImageVector? = null
