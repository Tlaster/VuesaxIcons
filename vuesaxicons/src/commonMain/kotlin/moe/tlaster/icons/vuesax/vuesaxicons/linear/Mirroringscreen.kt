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

public val LinearGroup.Mirroringscreen: ImageVector
    get() {
        if (_mirroringscreen != null) {
            return _mirroringscreen!!
        }
        _mirroringscreen = Builder(name = "Mirroringscreen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 5.0f, 4.0f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 3.0f, 22.0f, 5.0f, 22.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 19.0f, 20.0f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.6899f, 11.71f)
                curveTo(8.3099f, 12.3f, 11.6999f, 15.7f, 12.2999f, 20.32f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.62f, 15.0699f)
                curveTo(6.01f, 15.4999f, 8.5f, 18.0f, 8.94f, 21.39f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.98f, 18.86f)
                curveTo(3.67f, 19.08f, 4.92f, 20.32f, 5.14f, 22.02f)
            }
        }
        .build()
        return _mirroringscreen!!
    }

private var _mirroringscreen: ImageVector? = null
