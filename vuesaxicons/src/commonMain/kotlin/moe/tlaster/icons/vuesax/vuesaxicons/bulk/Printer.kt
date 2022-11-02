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

public val BulkGroup.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = Builder(name = "Printer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 15.0f)
                verticalLineTo(19.0f)
                curveTo(16.0f, 20.66f, 14.66f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(9.34f, 22.0f, 8.0f, 20.66f, 8.0f, 19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                verticalLineTo(5.0f)
                curveTo(7.0f, 3.34f, 8.34f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(15.66f, 2.0f, 17.0f, 3.34f, 17.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                horizontalLineTo(6.0f)
                curveTo(4.0f, 7.0f, 3.0f, 8.0f, 3.0f, 10.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 17.0f, 4.0f, 18.0f, 6.0f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                curveTo(20.0f, 18.0f, 21.0f, 17.0f, 21.0f, 15.0f)
                verticalLineTo(10.0f)
                curveTo(21.0f, 8.0f, 20.0f, 7.0f, 18.0f, 7.0f)
                close()
                moveTo(10.0f, 11.75f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 11.75f, 6.25f, 11.41f, 6.25f, 11.0f)
                curveTo(6.25f, 10.59f, 6.59f, 10.25f, 7.0f, 10.25f)
                horizontalLineTo(10.0f)
                curveTo(10.41f, 10.25f, 10.75f, 10.59f, 10.75f, 11.0f)
                curveTo(10.75f, 11.41f, 10.41f, 11.75f, 10.0f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.75f, 11.0f)
                curveTo(10.75f, 11.41f, 10.41f, 11.75f, 10.0f, 11.75f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 11.75f, 6.25f, 11.41f, 6.25f, 11.0f)
                curveTo(6.25f, 10.59f, 6.59f, 10.25f, 7.0f, 10.25f)
                horizontalLineTo(10.0f)
                curveTo(10.41f, 10.25f, 10.75f, 10.59f, 10.75f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.75f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 15.75f, 6.25f, 15.41f, 6.25f, 15.0f)
                curveTo(6.25f, 14.59f, 6.59f, 14.25f, 7.0f, 14.25f)
                horizontalLineTo(17.0f)
                curveTo(17.41f, 14.25f, 17.75f, 14.59f, 17.75f, 15.0f)
                curveTo(17.75f, 15.41f, 17.41f, 15.75f, 17.0f, 15.75f)
                close()
            }
        }
        .build()
        return _printer!!
    }

private var _printer: ImageVector? = null
