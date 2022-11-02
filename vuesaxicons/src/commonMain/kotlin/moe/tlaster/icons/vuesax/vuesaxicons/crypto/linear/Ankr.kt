package moe.tlaster.icons.vuesax.vuesaxicons.crypto.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.LinearGroup

public val LinearGroup.Ankr: ImageVector
    get() {
        if (_ankr != null) {
            return _ankr!!
        }
        _ankr = Builder(name = "Ankr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.1001f, 9.8f)
                verticalLineTo(6.4f)
                lineTo(12.0001f, 2.0f)
                lineTo(20.9001f, 6.4f)
                verticalLineTo(9.8f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.1001f, 14.2f)
                verticalLineTo(17.6f)
                lineTo(12.0001f, 22.0f)
                lineTo(20.9001f, 17.6f)
                verticalLineTo(14.2f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.9999f)
                verticalLineTo(16.3999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0001f, 16.4001f)
                curveTo(14.4302f, 16.4001f, 16.4001f, 14.4302f, 16.4001f, 12.0001f)
                curveTo(16.4001f, 9.57f, 14.4302f, 7.6001f, 12.0001f, 7.6001f)
                curveTo(9.57f, 7.6001f, 7.6001f, 9.57f, 7.6001f, 12.0001f)
                curveTo(7.6001f, 14.4302f, 9.57f, 16.4001f, 12.0001f, 16.4001f)
                close()
            }
        }
        .build()
        return _ankr!!
    }

private var _ankr: ImageVector? = null
