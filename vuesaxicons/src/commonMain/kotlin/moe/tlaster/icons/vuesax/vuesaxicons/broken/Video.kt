package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = Builder(name = "Video", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 7.7901f)
                curveTo(2.0f, 4.6301f, 3.05f, 3.5801f, 6.21f, 3.5801f)
                horizontalLineTo(12.53f)
                curveTo(15.69f, 3.5801f, 16.74f, 4.6301f, 16.74f, 7.7901f)
                verticalLineTo(16.2101f)
                curveTo(16.74f, 19.3701f, 15.69f, 20.4201f, 12.53f, 20.4201f)
                horizontalLineTo(6.21f)
                curveTo(3.05f, 20.4201f, 2.0f, 18.3201f, 2.0f, 16.2101f)
                verticalLineTo(12.1201f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5202f, 17.0999f)
                lineTo(16.7402f, 15.1499f)
                verticalLineTo(8.8399f)
                lineTo(19.5202f, 6.8899f)
                curveTo(20.8802f, 5.9399f, 22.0002f, 6.5199f, 22.0002f, 8.1899f)
                verticalLineTo(15.8099f)
                curveTo(22.0002f, 17.4799f, 20.8802f, 18.0599f, 19.5202f, 17.0999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 9.5f)
                curveTo(13.0f, 8.67f, 12.33f, 8.0f, 11.5f, 8.0f)
                curveTo(10.67f, 8.0f, 10.0f, 8.67f, 10.0f, 9.5f)
                curveTo(10.0f, 10.33f, 10.67f, 11.0f, 11.5f, 11.0f)
            }
        }
        .build()
        return _video!!
    }

private var _video: ImageVector? = null
