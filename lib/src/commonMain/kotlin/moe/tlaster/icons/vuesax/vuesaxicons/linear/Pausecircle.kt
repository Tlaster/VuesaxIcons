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

public val LinearGroup.Pausecircle: ImageVector
    get() {
        if (_pausecircle != null) {
            return _pausecircle!!
        }
        _pausecircle = Builder(name = "Pausecircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.97f, 22.0f)
                curveTo(17.4928f, 22.0f, 21.97f, 17.5228f, 21.97f, 12.0f)
                curveTo(21.97f, 6.4771f, 17.4928f, 2.0f, 11.97f, 2.0f)
                curveTo(6.4471f, 2.0f, 1.97f, 6.4771f, 1.97f, 12.0f)
                curveTo(1.97f, 17.5228f, 6.4471f, 22.0f, 11.97f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.72f, 14.53f)
                verticalLineTo(9.47f)
                curveTo(10.72f, 8.9901f, 10.52f, 8.8f, 10.01f, 8.8f)
                horizontalLineTo(8.71f)
                curveTo(8.2f, 8.8f, 8.0f, 8.9901f, 8.0f, 9.47f)
                verticalLineTo(14.53f)
                curveTo(8.0f, 15.01f, 8.2f, 15.2f, 8.71f, 15.2f)
                horizontalLineTo(10.0f)
                curveTo(10.52f, 15.2f, 10.72f, 15.01f, 10.72f, 14.53f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 14.53f)
                verticalLineTo(9.47f)
                curveTo(16.0f, 8.9901f, 15.8f, 8.8f, 15.29f, 8.8f)
                horizontalLineTo(14.0f)
                curveTo(13.49f, 8.8f, 13.29f, 8.9901f, 13.29f, 9.47f)
                verticalLineTo(14.53f)
                curveTo(13.29f, 15.01f, 13.49f, 15.2f, 14.0f, 15.2f)
                horizontalLineTo(15.29f)
                curveTo(15.8f, 15.2f, 16.0f, 15.01f, 16.0f, 14.53f)
                close()
            }
        }
        .build()
        return _pausecircle!!
    }

private var _pausecircle: ImageVector? = null
