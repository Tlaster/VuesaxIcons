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

public val BrokenGroup.Dollarsquare: ImageVector
    get() {
        if (_dollarsquare != null) {
            return _dollarsquare!!
        }
        _dollarsquare = Builder(name = "Dollarsquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.6699f, 14.3301f)
                curveTo(8.6699f, 15.6201f, 9.6599f, 16.6601f, 10.8899f, 16.6601f)
                horizontalLineTo(13.3999f)
                curveTo(14.4699f, 16.6601f, 15.3399f, 15.7501f, 15.3399f, 14.6301f)
                curveTo(15.3399f, 13.4101f, 14.8099f, 12.9801f, 14.0199f, 12.7001f)
                lineTo(9.9899f, 11.3001f)
                curveTo(9.1999f, 11.0201f, 8.6699f, 10.5901f, 8.6699f, 9.3701f)
                curveTo(8.6699f, 8.2501f, 9.5399f, 7.3401f, 10.6099f, 7.3401f)
                horizontalLineTo(13.1199f)
                curveTo(14.3499f, 7.3401f, 15.3399f, 8.3801f, 15.3399f, 9.6701f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                verticalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                curveTo(2.0f, 4.0f, 4.0f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 2.0f, 22.0f, 4.0f, 22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 20.0f, 20.0f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 22.0f, 2.0f, 20.0f, 2.0f, 15.0f)
                verticalLineTo(13.03f)
            }
        }
        .build()
        return _dollarsquare!!
    }

private var _dollarsquare: ImageVector? = null
