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

public val LinearGroup.Nemxem: ImageVector
    get() {
        if (_nemxem != null) {
            return _nemxem!!
        }
        _nemxem = Builder(name = "Nemxem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 4.9999f)
                curveTo(2.0f, 4.9999f, 12.0f, -1.0001f, 22.0f, 4.9999f)
                curveTo(22.0f, 4.9999f, 22.0f, 15.9999f, 12.0f, 21.9999f)
                curveTo(12.0f, 21.9999f, 2.0f, 16.9999f, 2.0f, 4.9999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.1001f, 7.1f)
                curveTo(5.2001f, 17.1f, 12.0001f, 10.0f, 12.0001f, 10.0f)
                curveTo(11.0001f, 4.0001f, 16.1001f, 2.9f, 16.1001f, 2.9f)
                lineTo(16.7001f, 2.8001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.4f, 18.5f)
                curveTo(16.4f, 18.5f, 19.0f, 13.0f, 12.0f, 10.0f)
            }
        }
        .build()
        return _nemxem!!
    }

private var _nemxem: ImageVector? = null
