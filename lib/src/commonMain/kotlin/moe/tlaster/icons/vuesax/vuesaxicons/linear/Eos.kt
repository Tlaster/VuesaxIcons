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

public val LinearGroup.Eos: ImageVector
    get() {
        if (_eos != null) {
            return _eos!!
        }
        _eos = Builder(name = "Eos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.7998f, 3.4f)
                lineTo(7.1998f, 7.7f)
                curveTo(7.0998f, 7.9001f, 6.9998f, 8.2001f, 6.8998f, 8.4001f)
                lineTo(5.1998f, 17.0f)
                curveTo(5.0998f, 17.6f, 5.3998f, 18.3f, 5.8998f, 18.6f)
                lineTo(11.1998f, 21.6f)
                curveTo(11.5998f, 21.8f, 12.2998f, 21.8f, 12.6998f, 21.6f)
                lineTo(17.9998f, 18.6f)
                curveTo(18.4998f, 18.3f, 18.7998f, 17.6f, 18.6998f, 17.0f)
                lineTo(16.9998f, 8.4001f)
                curveTo(16.9998f, 8.2001f, 16.7998f, 7.9001f, 16.6998f, 7.7f)
                lineTo(13.0998f, 3.4f)
                curveTo(12.4998f, 2.6f, 11.4998f, 2.6f, 10.7998f, 3.4f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.8002f, 8.5f)
                lineTo(12.5002f, 20.7f)
                curveTo(12.3002f, 21.1f, 11.7002f, 21.1f, 11.6002f, 20.7f)
                lineTo(7.2002f, 8.5f)
            }
        }
        .build()
        return _eos!!
    }

private var _eos: ImageVector? = null
