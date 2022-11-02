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

public val BulkGroup.Mousesquare: ImageVector
    get() {
        if (_mousesquare != null) {
            return _mousesquare!!
        }
        _mousesquare = Builder(name = "Mousesquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.4798f, 2.0f)
                horizontalLineTo(7.5298f)
                curveTo(4.0698f, 2.0f, 2.0098f, 4.06f, 2.0098f, 7.52f)
                verticalLineTo(15.47f)
                curveTo(2.0098f, 18.93f, 4.0798f, 20.99f, 7.5298f, 20.99f)
                horizontalLineTo(15.4798f)
                curveTo(18.9398f, 20.99f, 20.9998f, 18.93f, 20.9998f, 15.47f)
                verticalLineTo(7.52f)
                curveTo(20.9998f, 4.06f, 18.9298f, 2.0f, 15.4798f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9597f, 18.84f)
                lineTo(20.3297f, 19.39f)
                curveTo(19.8797f, 19.54f, 19.5197f, 19.89f, 19.3697f, 20.35f)
                lineTo(18.8197f, 21.98f)
                curveTo(18.3497f, 23.39f, 16.3697f, 23.36f, 15.9297f, 21.95f)
                lineTo(14.0797f, 16.0f)
                curveTo(13.7197f, 14.82f, 14.8097f, 13.72f, 15.9797f, 14.09f)
                lineTo(21.9397f, 15.94f)
                curveTo(23.3397f, 16.38f, 23.3597f, 18.37f, 21.9597f, 18.84f)
                close()
            }
        }
        .build()
        return _mousesquare!!
    }

private var _mousesquare: ImageVector? = null
