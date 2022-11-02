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

public val BulkGroup.Command: ImageVector
    get() {
        if (_command != null) {
            return _command!!
        }
        _command = Builder(name = "Command", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 22.0f)
                curveTo(6.65f, 22.0f, 8.0f, 20.65f, 8.0f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                curveTo(3.35f, 16.0f, 2.0f, 17.35f, 2.0f, 19.0f)
                curveTo(2.0f, 20.65f, 3.35f, 22.0f, 5.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                curveTo(8.0f, 3.35f, 6.65f, 2.0f, 5.0f, 2.0f)
                curveTo(3.35f, 2.0f, 2.0f, 3.35f, 2.0f, 5.0f)
                curveTo(2.0f, 6.65f, 3.35f, 8.0f, 5.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                horizontalLineTo(19.0f)
                curveTo(20.65f, 8.0f, 22.0f, 6.65f, 22.0f, 5.0f)
                curveTo(22.0f, 3.35f, 20.65f, 2.0f, 19.0f, 2.0f)
                curveTo(17.35f, 2.0f, 16.0f, 3.35f, 16.0f, 5.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 22.0f)
                curveTo(20.65f, 22.0f, 22.0f, 20.65f, 22.0f, 19.0f)
                curveTo(22.0f, 17.35f, 20.65f, 16.0f, 19.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                curveTo(16.0f, 20.65f, 17.35f, 22.0f, 19.0f, 22.0f)
                close()
            }
        }
        .build()
        return _command!!
    }

private var _command: ImageVector? = null
