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

public val LinearGroup.Velas: ImageVector
    get() {
        if (_velas != null) {
            return _velas!!
        }
        _velas = Builder(name = "Velas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.9999f, 6.3999f)
                horizontalLineTo(19.9999f)
                curveTo(20.8999f, 6.3999f, 21.3999f, 7.3999f, 20.8999f, 8.0999f)
                lineTo(12.8999f, 20.4999f)
                curveTo(12.4999f, 21.1999f, 11.4999f, 21.1999f, 10.9999f, 20.4999f)
                lineTo(2.9999f, 8.0999f)
                curveTo(2.5999f, 7.2999f, 3.1999f, 6.3999f, 3.9999f, 6.3999f)
                close()
            }
        }
        .build()
        return _velas!!
    }

private var _velas: ImageVector? = null
