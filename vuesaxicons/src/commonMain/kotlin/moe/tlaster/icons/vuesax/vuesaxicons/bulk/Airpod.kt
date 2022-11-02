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

public val BulkGroup.Airpod: ImageVector
    get() {
        if (_airpod != null) {
            return _airpod!!
        }
        _airpod = Builder(name = "Airpod", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.5f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(21.5f, 19.99f, 19.49f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(4.51f, 22.0f, 2.5f, 19.99f, 2.5f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(2.5f, 4.01f, 4.51f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(19.49f, 2.0f, 21.5f, 4.01f, 21.5f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 8.17f)
                verticalLineTo(9.67f)
                horizontalLineTo(17.37f)
                curveTo(17.06f, 10.64f, 16.15f, 11.34f, 15.08f, 11.34f)
                horizontalLineTo(8.92f)
                curveTo(8.28f, 11.34f, 7.65f, 11.08f, 7.2f, 10.62f)
                curveTo(6.93f, 10.36f, 6.74f, 10.03f, 6.62f, 9.67f)
                horizontalLineTo(2.5f)
                verticalLineTo(8.17f)
                horizontalLineTo(6.63f)
                curveTo(6.94f, 7.2f, 7.85f, 6.5f, 8.92f, 6.5f)
                horizontalLineTo(15.07f)
                curveTo(15.72f, 6.5f, 16.34f, 6.76f, 16.79f, 7.22f)
                curveTo(17.06f, 7.49f, 17.26f, 7.81f, 17.37f, 8.17f)
                horizontalLineTo(21.5f)
                close()
            }
        }
        .build()
        return _airpod!!
    }

private var _airpod: ImageVector? = null
