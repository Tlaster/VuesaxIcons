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

public val LinearGroup.Cloudnotif: ImageVector
    get() {
        if (_cloudnotif != null) {
            return _cloudnotif!!
        }
        _cloudnotif = Builder(name = "Cloudnotif", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.8999f, 13.96f)
                curveTo(22.1699f, 15.63f, 21.6999f, 17.42f, 20.2699f, 18.68f)
                curveTo(19.2799f, 19.59f, 17.9799f, 20.09f, 16.6299f, 20.08f)
                horizontalLineTo(5.5399f)
                curveTo(0.8699f, 19.74f, 0.8599f, 12.94f, 5.5399f, 12.6f)
                horizontalLineTo(5.5899f)
                curveTo(3.3999f, 6.47f, 9.0899f, 2.87f, 13.3799f, 4.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.2601f, 13.01f)
                curveTo(6.7401f, 12.75f, 6.1701f, 12.61f, 5.5901f, 12.6f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.97f, 8.5f)
                curveTo(21.97f, 9.6f, 21.46f, 10.59f, 20.65f, 11.23f)
                curveTo(20.06f, 11.71f, 19.29f, 12.0f, 18.47f, 12.0f)
                curveTo(16.54f, 12.0f, 14.97f, 10.43f, 14.97f, 8.5f)
                curveTo(14.97f, 7.54f, 15.36f, 6.67f, 16.0f, 6.04f)
                verticalLineTo(6.03f)
                curveTo(16.63f, 5.39f, 17.51f, 5.0f, 18.47f, 5.0f)
                curveTo(20.4f, 5.0f, 21.97f, 6.57f, 21.97f, 8.5f)
                close()
            }
        }
        .build()
        return _cloudnotif!!
    }

private var _cloudnotif: ImageVector? = null
