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

public val BulkGroup.Frame1: ImageVector
    get() {
        if (_frame1 != null) {
            return _frame1!!
        }
        _frame1 = Builder(name = "Frame1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.02f, 4.6201f)
                horizontalLineTo(6.98f)
                curveTo(5.39f, 4.6201f, 4.75f, 5.2201f, 4.75f, 6.7401f)
                verticalLineTo(18.6201f)
                horizontalLineTo(10.25f)
                verticalLineTo(6.7401f)
                curveTo(10.24f, 5.2201f, 9.6f, 4.6201f, 8.02f, 4.6201f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.52f, 9.6201f)
                horizontalLineTo(15.48f)
                curveTo(13.89f, 9.6201f, 13.25f, 10.2301f, 13.25f, 11.7401f)
                verticalLineTo(18.6201f)
                horizontalLineTo(18.75f)
                verticalLineTo(11.7401f)
                curveTo(18.75f, 10.2301f, 18.1f, 9.6201f, 16.52f, 9.6201f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 17.8799f)
                horizontalLineTo(21.25f)
                curveTo(21.66f, 17.8799f, 22.0f, 18.2199f, 22.0f, 18.6299f)
                curveTo(22.0f, 19.0399f, 21.66f, 19.3799f, 21.25f, 19.3799f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 19.3799f, 2.0f, 19.0399f, 2.0f, 18.6199f)
                curveTo(2.0f, 18.1999f, 2.34f, 17.8799f, 2.75f, 17.8799f)
                close()
            }
        }
        .build()
        return _frame1!!
    }

private var _frame1: ImageVector? = null
