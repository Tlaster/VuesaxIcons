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

public val LinearGroup.Attachcircle: ImageVector
    get() {
        if (_attachcircle != null) {
            return _attachcircle!!
        }
        _attachcircle = Builder(name = "Attachcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.1999f, 11.8f)
                lineTo(10.7899f, 13.21f)
                curveTo(10.0099f, 13.99f, 10.0099f, 15.26f, 10.7899f, 16.04f)
                curveTo(11.5699f, 16.82f, 12.8399f, 16.82f, 13.6199f, 16.04f)
                lineTo(15.8399f, 13.82f)
                curveTo(17.3999f, 12.26f, 17.3999f, 9.73f, 15.8399f, 8.16f)
                curveTo(14.2799f, 6.6f, 11.7499f, 6.6f, 10.1799f, 8.16f)
                lineTo(7.7599f, 10.58f)
                curveTo(6.4199f, 11.92f, 6.4199f, 14.09f, 7.7599f, 15.43f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _attachcircle!!
    }

private var _attachcircle: ImageVector? = null
