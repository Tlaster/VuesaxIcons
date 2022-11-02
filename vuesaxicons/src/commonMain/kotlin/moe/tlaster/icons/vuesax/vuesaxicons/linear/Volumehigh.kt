package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Volumehigh: ImageVector
    get() {
        if (_volumehigh != null) {
            return _volumehigh!!
        }
        _volumehigh = Builder(name = "Volumehigh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 16.0f, 3.0f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(6.43f)
                curveTo(6.8f, 17.0f, 7.17f, 17.11f, 7.49f, 17.3f)
                lineTo(10.41f, 19.13f)
                curveTo(12.93f, 20.71f, 15.0f, 19.56f, 15.0f, 16.59f)
                verticalLineTo(7.41f)
                curveTo(15.0f, 4.43f, 12.93f, 3.29f, 10.41f, 4.87f)
                lineTo(7.49f, 6.7f)
                curveTo(7.17f, 6.89f, 6.8f, 7.0f, 6.43f, 7.0f)
                horizontalLineTo(5.0f)
                curveTo(3.0f, 7.0f, 2.0f, 8.0f, 2.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                curveTo(19.78f, 10.37f, 19.78f, 13.63f, 18.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.83f, 5.5f)
                curveTo(22.72f, 9.35f, 22.72f, 14.65f, 19.83f, 18.5f)
            }
        }
        .build()
        return _volumehigh!!
    }

private var _volumehigh: ImageVector? = null
