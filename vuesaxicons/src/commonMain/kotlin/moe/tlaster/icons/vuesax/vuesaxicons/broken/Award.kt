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

public val BrokenGroup.Award: ImageVector
    get() {
        if (_award != null) {
            return _award!!
        }
        _award = Builder(name = "Award", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0198f, 18.9599f)
                curveTo(19.7398f, 17.7999f, 19.7398f, 17.7999f, 19.7398f, 15.9799f)
                verticalLineTo(11.0099f)
                curveTo(19.7398f, 9.1899f, 19.7398f, 9.1899f, 18.0198f, 8.0299f)
                lineTo(13.2898f, 5.2999f)
                curveTo(12.5798f, 4.8899f, 11.4198f, 4.8899f, 10.7098f, 5.2999f)
                lineTo(5.9798f, 8.0399f)
                curveTo(4.2598f, 9.1999f, 4.2598f, 9.1999f, 4.2598f, 11.0199f)
                verticalLineTo(15.9899f)
                curveTo(4.2598f, 17.8099f, 4.2598f, 17.8099f, 5.9798f, 18.9699f)
                lineTo(10.7098f, 21.6999f)
                curveTo(11.4198f, 22.1099f, 12.5798f, 22.1099f, 13.2898f, 21.6999f)
                lineTo(14.8098f, 20.8199f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 7.63f)
                verticalLineTo(5.0f)
                curveTo(17.5f, 3.0f, 16.5f, 2.0f, 14.5f, 2.0f)
                horizontalLineTo(9.5f)
                curveTo(7.5f, 2.0f, 6.5f, 3.0f, 6.5f, 5.0f)
                verticalLineTo(7.56f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.2795f, 16.4199f)
                curveTo(12.1295f, 16.3599f, 11.8795f, 16.3599f, 11.7295f, 16.4199f)
                lineTo(10.7495f, 16.8099f)
                curveTo(10.1495f, 17.0499f, 9.6896f, 16.7099f, 9.7296f, 16.0699f)
                lineTo(9.7895f, 15.0199f)
                curveTo(9.7996f, 14.8599f, 9.7196f, 14.6199f, 9.6195f, 14.4999f)
                lineTo(8.9495f, 13.6899f)
                curveTo(8.5395f, 13.1899f, 8.7095f, 12.6499f, 9.3396f, 12.4899f)
                lineTo(10.3595f, 12.2299f)
                curveTo(10.5195f, 12.1899f, 10.7195f, 12.0399f, 10.7995f, 11.9099f)
                lineTo(11.3695f, 11.0199f)
                curveTo(11.7195f, 10.4699f, 12.2895f, 10.4699f, 12.6395f, 11.0199f)
                lineTo(13.2095f, 11.9099f)
                curveTo(13.2995f, 12.0499f, 13.4995f, 12.1899f, 13.6495f, 12.2299f)
                lineTo(14.6695f, 12.4899f)
                curveTo(15.2995f, 12.6499f, 15.4695f, 13.1899f, 15.0595f, 13.6899f)
                lineTo(14.3895f, 14.4999f)
                curveTo(14.2895f, 14.6299f, 14.2095f, 14.8599f, 14.2195f, 15.0199f)
            }
        }
        .build()
        return _award!!
    }

private var _award: ImageVector? = null
