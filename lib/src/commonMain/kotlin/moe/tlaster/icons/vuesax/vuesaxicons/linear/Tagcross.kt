package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Tagcross: ImageVector
    get() {
        if (_tagcross != null) {
            return _tagcross!!
        }
        _tagcross = Builder(name = "Tagcross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.2801f, 20.25f)
                horizontalLineTo(17.0001f)
                curveTo(19.7601f, 20.25f, 22.0001f, 18.01f, 22.0001f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(22.0001f, 5.99f, 19.7601f, 3.75f, 17.0001f, 3.75f)
                horizontalLineTo(10.2801f)
                curveTo(8.8701f, 3.75f, 7.53f, 4.34f, 6.58f, 5.39f)
                lineTo(3.0501f, 9.27f)
                curveTo(1.6401f, 10.82f, 1.6401f, 13.18f, 3.0501f, 14.73f)
                lineTo(6.58f, 18.61f)
                curveTo(7.53f, 19.66f, 8.8701f, 20.25f, 10.2801f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0001f, 14.47f)
                lineTo(11.0601f, 9.53f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0601f, 14.47f)
                lineTo(16.0001f, 9.53f)
            }
        }
        .build()
        return _tagcross!!
    }

private var _tagcross: ImageVector? = null
