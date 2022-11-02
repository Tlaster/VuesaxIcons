package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Creativecommons: ImageVector
    get() {
        if (_creativecommons != null) {
            return _creativecommons!!
        }
        _creativecommons = Builder(name = "Creativecommons", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.8792f, 14.1499f)
                curveTo(10.3692f, 14.5899f, 9.7091f, 14.8699f, 8.9891f, 14.8699f)
                curveTo(7.4091f, 14.8699f, 6.1191f, 13.5899f, 6.1191f, 11.9999f)
                curveTo(6.1191f, 10.4099f, 7.3991f, 9.1299f, 8.9891f, 9.1299f)
                curveTo(9.7191f, 9.1299f, 10.3792f, 9.3998f, 10.8792f, 9.8498f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.8792f, 14.1499f)
                curveTo(17.3692f, 14.5899f, 16.7091f, 14.8699f, 15.9891f, 14.8699f)
                curveTo(14.4091f, 14.8699f, 13.1191f, 13.5899f, 13.1191f, 11.9999f)
                curveTo(13.1191f, 10.4099f, 14.3991f, 9.1299f, 15.9891f, 9.1299f)
                curveTo(16.7191f, 9.1299f, 17.3792f, 9.3998f, 17.8792f, 9.8498f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(2.75f, 7.67f, 2.0f, 9.75f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                curveTo(10.57f, 2.0f, 9.2f, 2.3f, 7.97f, 2.85f)
            }
        }
        .build()
        return _creativecommons!!
    }

private var _creativecommons: ImageVector? = null
