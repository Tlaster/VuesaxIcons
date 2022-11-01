package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Fingerscan: ImageVector
    get() {
        if (_fingerscan != null) {
            return _fingerscan!!
        }
        _fingerscan = Builder(name = "Fingerscan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.88f)
                curveTo(11.09f, 14.88f, 10.35f, 14.14f, 10.35f, 13.23f)
                verticalLineTo(10.76f)
                curveTo(10.35f, 9.85f, 11.09f, 9.11f, 12.0f, 9.11f)
                curveTo(12.91f, 9.11f, 13.65f, 9.85f, 13.65f, 10.76f)
                verticalLineTo(13.23f)
                curveTo(13.65f, 14.14f, 12.91f, 14.88f, 12.0f, 14.88f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.98f, 13.4699f)
                curveTo(16.78f, 16.0499f, 14.62f, 18.0699f, 12.0f, 18.0699f)
                curveTo(9.24f, 18.0699f, 7.0f, 15.8299f, 7.0f, 13.0699f)
                verticalLineTo(10.9299f)
                curveTo(7.0f, 8.1699f, 9.24f, 5.9299f, 12.0f, 5.9299f)
                curveTo(14.59f, 5.9299f, 16.72f, 7.8999f, 16.97f, 10.4199f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 2.0f, 22.0f, 4.0f, 22.0f, 7.0f)
                verticalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 4.0f, 4.0f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 22.0f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 17.0f)
                verticalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(9.0f)
            }
        }
        .build()
        return _fingerscan!!
    }

private var _fingerscan: ImageVector? = null
