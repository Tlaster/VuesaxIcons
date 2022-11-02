package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Crown1: ImageVector
    get() {
        if (_crown1 != null) {
            return _crown1!!
        }
        _crown1 = Builder(name = "Crown1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0003f, 5.71f)
                verticalLineTo(15.29f)
                curveTo(22.0003f, 18.05f, 19.7603f, 20.29f, 17.0003f, 20.29f)
                horizontalLineTo(7.0003f)
                curveTo(6.5403f, 20.29f, 6.1003f, 20.23f, 5.6703f, 20.11f)
                curveTo(5.0503f, 19.94f, 4.8503f, 19.15f, 5.3103f, 18.69f)
                lineTo(15.9403f, 8.06f)
                curveTo(16.1603f, 7.84f, 16.4903f, 7.79f, 16.8003f, 7.85f)
                curveTo(17.1203f, 7.91f, 17.4703f, 7.82f, 17.7203f, 7.58f)
                lineTo(20.2903f, 5.0f)
                curveTo(21.2303f, 4.06f, 22.0003f, 4.37f, 22.0003f, 5.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.64f, 7.36f)
                lineTo(4.17f, 17.83f)
                curveTo(3.69f, 18.31f, 2.89f, 18.19f, 2.57f, 17.59f)
                curveTo(2.2f, 16.91f, 2.0f, 16.12f, 2.0f, 15.29f)
                verticalLineTo(5.71f)
                curveTo(2.0f, 4.37f, 2.77f, 4.06f, 3.71f, 5.0f)
                lineTo(6.29f, 7.59f)
                curveTo(6.68f, 7.97f, 7.32f, 7.97f, 7.71f, 7.59f)
                lineTo(11.29f, 4.0f)
                curveTo(11.68f, 3.61f, 12.32f, 3.61f, 12.71f, 4.0f)
                lineTo(14.65f, 5.94f)
                curveTo(15.03f, 6.33f, 15.03f, 6.97f, 14.64f, 7.36f)
                close()
            }
        }
        .build()
        return _crown1!!
    }

private var _crown1: ImageVector? = null
