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

public val BulkGroup.Frame3: ImageVector
    get() {
        if (_frame3 != null) {
            return _frame3!!
        }
        _frame3 = Builder(name = "Frame3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5407f, 15.0f)
                curveTo(20.2607f, 19.06f, 16.4707f, 22.0f, 12.0007f, 22.0f)
                curveTo(7.5407f, 22.0f, 3.7607f, 19.08f, 2.4707f, 15.04f)
                horizontalLineTo(3.0507f)
                lineTo(7.0007f, 15.0f)
                verticalLineTo(11.76f)
                curveTo(7.0007f, 10.84f, 8.1507f, 10.41f, 8.7507f, 11.11f)
                lineTo(12.0007f, 15.0f)
                lineTo(15.2507f, 11.11f)
                curveTo(15.8507f, 10.41f, 17.0007f, 10.84f, 17.0007f, 11.76f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.5407f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 13.05f, 21.84f, 14.05f, 21.54f, 15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.76f)
                curveTo(17.0f, 10.84f, 15.85f, 10.41f, 15.25f, 11.11f)
                lineTo(12.0f, 15.0f)
                lineTo(8.75f, 11.11f)
                curveTo(8.15f, 10.41f, 7.0f, 10.84f, 7.0f, 11.76f)
                verticalLineTo(15.0f)
                lineTo(3.05f, 15.04f)
                horizontalLineTo(2.47f)
                curveTo(2.17f, 14.08f, 2.0f, 13.06f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _frame3!!
    }

private var _frame3: ImageVector? = null
