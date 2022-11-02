package moe.tlaster.icons.vuesax.vuesaxicons.crypto.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.LinearGroup

public val LinearGroup.Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(name = "Facebook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 9.3f)
                verticalLineTo(12.2f)
                horizontalLineTo(16.6f)
                curveTo(16.8f, 12.2f, 16.9f, 12.4f, 16.9f, 12.6f)
                lineTo(16.5f, 14.5f)
                curveTo(16.5f, 14.6f, 16.3f, 14.7f, 16.2f, 14.7f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.8f)
                horizontalLineTo(9.3f)
                curveTo(9.1f, 14.8f, 9.0f, 14.7f, 9.0f, 14.5f)
                verticalLineTo(12.6f)
                curveTo(9.0f, 12.4f, 9.1f, 12.3f, 9.3f, 12.3f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                curveTo(11.0f, 7.3f, 12.3f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(16.7f)
                curveTo(16.9f, 6.0f, 17.0f, 6.1f, 17.0f, 6.3f)
                verticalLineTo(8.7f)
                curveTo(17.0f, 8.9f, 16.9f, 9.0f, 16.7f, 9.0f)
                horizontalLineTo(14.3f)
                curveTo(14.1f, 9.0f, 14.0f, 9.1f, 14.0f, 9.3f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 22.0f, 2.0f, 20.0f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 4.0f, 4.0f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 2.0f, 22.0f, 4.0f, 22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 20.0f, 20.0f, 22.0f, 15.0f, 22.0f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
