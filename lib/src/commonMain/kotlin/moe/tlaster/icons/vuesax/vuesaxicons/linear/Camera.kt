package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.76f, 22.0f)
                horizontalLineTo(17.24f)
                curveTo(20.0f, 22.0f, 21.1f, 20.31f, 21.23f, 18.25f)
                lineTo(21.75f, 9.99f)
                curveTo(21.89f, 7.83f, 20.17f, 6.0f, 18.0f, 6.0f)
                curveTo(17.39f, 6.0f, 16.83f, 5.65f, 16.55f, 5.11f)
                lineTo(15.83f, 3.66f)
                curveTo(15.37f, 2.75f, 14.17f, 2.0f, 13.15f, 2.0f)
                horizontalLineTo(10.86f)
                curveTo(9.8301f, 2.0f, 8.63f, 2.75f, 8.17f, 3.66f)
                lineTo(7.45f, 5.11f)
                curveTo(7.1701f, 5.65f, 6.6101f, 6.0f, 6.0001f, 6.0f)
                curveTo(3.83f, 6.0f, 2.11f, 7.83f, 2.2501f, 9.99f)
                lineTo(2.7701f, 18.25f)
                curveTo(2.89f, 20.31f, 4.0001f, 22.0f, 6.76f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 8.0f)
                horizontalLineTo(13.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveTo(13.79f, 18.0f, 15.25f, 16.54f, 15.25f, 14.75f)
                curveTo(15.25f, 12.96f, 13.79f, 11.5f, 12.0f, 11.5f)
                curveTo(10.21f, 11.5f, 8.75f, 12.96f, 8.75f, 14.75f)
                curveTo(8.75f, 16.54f, 10.21f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
