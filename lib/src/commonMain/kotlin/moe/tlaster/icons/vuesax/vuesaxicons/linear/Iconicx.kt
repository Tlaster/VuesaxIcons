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

public val LinearGroup.Iconicx: ImageVector
    get() {
        if (_iconicx != null) {
            return _iconicx!!
        }
        _iconicx = Builder(name = "Iconicx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 3.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.2f, 3.8001f)
                horizontalLineTo(20.2999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 3.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.6999f, 20.2f)
                horizontalLineTo(3.7999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.6f, 6.0f)
                curveTo(14.5f, 5.4f, 13.3f, 5.0f, 12.0f, 5.0f)
                curveTo(8.1f, 5.0f, 5.0f, 8.1f, 5.0f, 12.0f)
                curveTo(5.0f, 13.3f, 5.4f, 14.6f, 6.0f, 15.7f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.3f, 18.0f)
                curveTo(9.4001f, 18.7f, 10.6f, 19.0f, 12.0f, 19.0f)
                curveTo(15.9f, 19.0f, 19.0f, 15.9f, 19.0f, 12.0f)
                curveTo(19.0f, 10.7f, 18.6f, 9.4001f, 18.0f, 8.3f)
            }
        }
        .build()
        return _iconicx!!
    }

private var _iconicx: ImageVector? = null
