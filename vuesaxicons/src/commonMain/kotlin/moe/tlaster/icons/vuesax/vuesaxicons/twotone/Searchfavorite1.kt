package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Searchfavorite1: ImageVector
    get() {
        if (_searchfavorite1 != null) {
            return _searchfavorite1!!
        }
        _searchfavorite1 = Builder(name = "Searchfavorite1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 11.5f)
                curveTo(21.0f, 16.75f, 16.75f, 21.0f, 11.5f, 21.0f)
                curveTo(6.25f, 21.0f, 2.0f, 16.75f, 2.0f, 11.5f)
                curveTo(2.0f, 6.25f, 6.25f, 2.0f, 11.5f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                lineTo(20.0f, 20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4999f, 6.1301f)
                curveTo(14.1499f, 5.0301f, 14.5599f, 3.6601f, 15.7199f, 3.2901f)
                curveTo(16.3299f, 3.0901f, 17.0799f, 3.2601f, 17.5099f, 3.8501f)
                curveTo(17.9099f, 3.2401f, 18.6899f, 3.1001f, 19.2899f, 3.2901f)
                curveTo(20.4499f, 3.6601f, 20.8599f, 5.0301f, 20.5099f, 6.1301f)
                curveTo(19.9599f, 7.8801f, 18.0399f, 8.7901f, 17.5099f, 8.7901f)
                curveTo(16.9699f, 8.7901f, 15.0699f, 7.9001f, 14.4999f, 6.1301f)
                close()
            }
        }
        .build()
        return _searchfavorite1!!
    }

private var _searchfavorite1: ImageVector? = null
