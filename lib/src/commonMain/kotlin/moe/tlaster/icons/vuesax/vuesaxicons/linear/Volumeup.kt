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

public val LinearGroup.Volumeup: ImageVector
    get() {
        if (_volumeup != null) {
            return _volumeup!!
        }
        _volumeup = Builder(name = "Volumeup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.96f)
                verticalLineTo(14.04f)
                curveTo(2.0f, 16.08f, 3.02f, 17.1f, 5.06f, 17.1f)
                horizontalLineTo(6.52f)
                curveTo(6.9f, 17.1f, 7.28f, 17.21f, 7.6f, 17.41f)
                lineTo(10.58f, 19.27f)
                curveTo(13.16f, 20.88f, 15.26f, 19.71f, 15.26f, 16.67f)
                verticalLineTo(7.32f)
                curveTo(15.26f, 4.28f, 13.15f, 3.11f, 10.58f, 4.72f)
                lineTo(7.6f, 6.59f)
                curveTo(7.27f, 6.79f, 6.9f, 6.9f, 6.52f, 6.9f)
                horizontalLineTo(5.06f)
                curveTo(3.02f, 6.9f, 2.0f, 7.92f, 2.0f, 9.96f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 14.0f)
                verticalLineTo(10.0f)
            }
        }
        .build()
        return _volumeup!!
    }

private var _volumeup: ImageVector? = null
