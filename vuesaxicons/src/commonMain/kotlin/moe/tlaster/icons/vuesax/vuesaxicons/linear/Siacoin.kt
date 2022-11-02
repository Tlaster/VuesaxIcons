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

public val LinearGroup.Siacoin: ImageVector
    get() {
        if (_siacoin != null) {
            return _siacoin!!
        }
        _siacoin = Builder(name = "Siacoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 2.8f)
                curveTo(9.2f, 2.3f, 10.6f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5f, 17.5f, 22.0f, 12.0f, 22.0f)
                curveTo(6.5f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                curveTo(2.0f, 10.6f, 2.3f, 9.2f, 2.8f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0001f, 16.2f)
                verticalLineTo(12.0f)
                curveTo(16.0001f, 9.7001f, 14.1001f, 7.8f, 11.8001f, 7.8f)
                curveTo(9.5001f, 7.8f, 7.6001f, 9.7001f, 7.6001f, 12.0f)
                curveTo(7.6001f, 14.3f, 9.5001f, 16.2f, 11.8001f, 16.2f)
                horizontalLineTo(16.0001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 6.5f)
                curveTo(5.8284f, 6.5f, 6.5f, 5.8284f, 6.5f, 5.0f)
                curveTo(6.5f, 4.1716f, 5.8284f, 3.5f, 5.0f, 3.5f)
                curveTo(4.1716f, 3.5f, 3.5f, 4.1716f, 3.5f, 5.0f)
                curveTo(3.5f, 5.8284f, 4.1716f, 6.5f, 5.0f, 6.5f)
                close()
            }
        }
        .build()
        return _siacoin!!
    }

private var _siacoin: ImageVector? = null
