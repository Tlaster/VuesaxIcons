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

public val BulkGroup.Usertick: ImageVector
    get() {
        if (_usertick != null) {
            return _usertick!!
        }
        _usertick = Builder(name = "Usertick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveTo(17.06f, 13.0f, 16.19f, 13.33f, 15.5f, 13.88f)
                curveTo(14.58f, 14.61f, 14.0f, 15.74f, 14.0f, 17.0f)
                curveTo(14.0f, 17.75f, 14.21f, 18.46f, 14.58f, 19.06f)
                curveTo(15.27f, 20.22f, 16.54f, 21.0f, 18.0f, 21.0f)
                curveTo(19.01f, 21.0f, 19.93f, 20.63f, 20.63f, 20.0f)
                curveTo(20.94f, 19.74f, 21.21f, 19.42f, 21.42f, 19.06f)
                curveTo(21.79f, 18.46f, 22.0f, 17.75f, 22.0f, 17.0f)
                curveTo(22.0f, 14.79f, 20.21f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(20.07f, 16.57f)
                lineTo(17.94f, 18.54f)
                curveTo(17.8f, 18.67f, 17.61f, 18.74f, 17.43f, 18.74f)
                curveTo(17.24f, 18.74f, 17.05f, 18.67f, 16.9f, 18.52f)
                lineTo(15.91f, 17.53f)
                curveTo(15.62f, 17.24f, 15.62f, 16.76f, 15.91f, 16.47f)
                curveTo(16.2f, 16.18f, 16.68f, 16.18f, 16.97f, 16.47f)
                lineTo(17.45f, 16.95f)
                lineTo(19.05f, 15.47f)
                curveTo(19.35f, 15.19f, 19.83f, 15.21f, 20.11f, 15.51f)
                curveTo(20.39f, 15.81f, 20.37f, 16.28f, 20.07f, 16.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0901f, 21.5f)
                curveTo(21.0901f, 21.78f, 20.8701f, 22.0f, 20.5901f, 22.0f)
                horizontalLineTo(3.4102f)
                curveTo(3.1302f, 22.0f, 2.9102f, 21.78f, 2.9102f, 21.5f)
                curveTo(2.9102f, 17.36f, 6.9901f, 14.0f, 12.0002f, 14.0f)
                curveTo(13.0302f, 14.0f, 14.0302f, 14.14f, 14.9502f, 14.41f)
                curveTo(14.3602f, 15.11f, 14.0002f, 16.02f, 14.0002f, 17.0f)
                curveTo(14.0002f, 17.75f, 14.2101f, 18.46f, 14.5801f, 19.06f)
                curveTo(14.7801f, 19.4f, 15.0401f, 19.71f, 15.3401f, 19.97f)
                curveTo(16.0401f, 20.61f, 16.9702f, 21.0f, 18.0002f, 21.0f)
                curveTo(19.1202f, 21.0f, 20.1302f, 20.54f, 20.8502f, 19.8f)
                curveTo(21.0102f, 20.34f, 21.0901f, 20.91f, 21.0901f, 21.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveTo(14.7614f, 12.0f, 17.0f, 9.7614f, 17.0f, 7.0f)
                curveTo(17.0f, 4.2386f, 14.7614f, 2.0f, 12.0f, 2.0f)
                curveTo(9.2386f, 2.0f, 7.0f, 4.2386f, 7.0f, 7.0f)
                curveTo(7.0f, 9.7614f, 9.2386f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _usertick!!
    }

private var _usertick: ImageVector? = null
