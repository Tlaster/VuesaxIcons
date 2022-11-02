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

public val LinearGroup.Rotateright: ImageVector
    get() {
        if (_rotateright != null) {
            return _rotateright!!
        }
        _rotateright = Builder(name = "Rotateright", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.89f, 5.0799f)
                curveTo(14.02f, 4.8199f, 13.06f, 4.6499f, 12.0f, 4.6499f)
                curveTo(7.21f, 4.6499f, 3.33f, 8.5299f, 3.33f, 13.3199f)
                curveTo(3.33f, 18.1199f, 7.21f, 21.9999f, 12.0f, 21.9999f)
                curveTo(16.79f, 21.9999f, 20.67f, 18.1199f, 20.67f, 13.3299f)
                curveTo(20.67f, 11.5499f, 20.13f, 9.8899f, 19.21f, 8.5099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.13f, 5.32f)
                lineTo(13.24f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.13f, 5.3201f)
                lineTo(12.76f, 7.7801f)
            }
        }
        .build()
        return _rotateright!!
    }

private var _rotateright: ImageVector? = null
